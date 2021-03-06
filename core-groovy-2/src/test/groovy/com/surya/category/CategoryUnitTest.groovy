package com.surya.category

import groovy.time.*
import java.text.SimpleDateFormat
import groovy.xml.*
import groovy.xml.dom.*
import com.surya.category.suryaCategory
import com.surya.category.NumberCategory

class CategoryUnitTest extends GroovyTestCase {

    void test_whenUsingTimeCategory_thenOperationOnDate() {
        def jan_1_2019 = new Date("01/01/2019")
        use (TimeCategory) {
            assert jan_1_2019 + 10.seconds == new Date("01/01/2019 00:00:10")

            assert jan_1_2019 + 20.minutes == new Date("01/01/2019 00:20:00")

            assert jan_1_2019 + 2.hours == new Date("01/01/2019 02:00:00")

            assert jan_1_2019 - 1.day == new Date("12/31/2018")

            assert jan_1_2019 + 2.weeks == new Date("01/15/2019")

            assert jan_1_2019 - 2.months == new Date("11/01/2018")

            assert jan_1_2019 + 3.years == new Date("01/01/2022")
        }
    }

    void test_whenUsingTimeCategory_thenOperationOnNumber() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
        use (TimeCategory) {
            assert sdf.format(5.days.from.now) == sdf.format(new Date() + 5.days)

            sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
            assert sdf.format(10.minutes.from.now) == sdf.format(new Date() + 10.minutes)
            assert sdf.format(2.hours.ago) == sdf.format(new Date() - 2.hours)
        }
    }

    void test_whenUsingDOMCategory_thenOperationOnXML() {

        def suryaArticlesText = """
<articles>
    <article core-java="true">
        <title>An Intro to the Java Debug Interface (JDI)</title>
        <desc>A quick and practical overview of Java Debug Interface.</desc>
    </article>
    <article core-java="false">
        <title>A Quick Guide to Working with Web Services in Groovy</title>
        <desc>Learn how to work with Web Services in Groovy.</desc>
    </article>
</articles>
"""
        def suryaArticlesDom = DOMBuilder.newInstance().parseText(suryaArticlesText)

        def root = suryaArticlesDom.documentElement

        use (DOMCategory) {
            assert root.article.size() == 2

            def articles = root.article

            assert articles[0].title.text() == "An Intro to the Java Debug Interface (JDI)"
            assert articles[1].desc.text() == "Learn how to work with Web Services in Groovy."

            def articleNode3 = root.appendNode(new QName("article"), ["core-java": "false"])

            articleNode3.appendNode("title", "Metaprogramming in Groovy")
            articleNode3.appendNode("desc", "Explore the concept of runtime and compile-time metaprogramming in Groovy")

            assert root.article.size() == 3

            assert root.article[2].title.text() == "Metaprogramming in Groovy"
        }
    }
    
    void test_whenUsingsuryaCategory_thenCapitalizeString() {
        use (suryaCategory) {
            assert "norman".capitalize() == "Norman"
        } 
    }
    
    void test_whenUsingsuryaCategory_thenOperationsOnNumber() {
        use (suryaCategory) {
            assert 50.toThePower(2) == 2500
            assert 2.4.toThePower(4) == 33.1776
        }
    }
    
    void test_whenUsingNumberCategory_thenOperationsOnNumber() {
        use (NumberCategory) {
            assert 3.cube() == 27
            assert 25.divideWithRoundUp(6, true) == 5
            assert 120.23.divideWithRoundUp(6.1, true) == 20
            assert 150.9.divideWithRoundUp(12.1, false) == 12
        }
    }

}
