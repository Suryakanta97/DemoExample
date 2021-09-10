package com.surya.traits

class Dog implements WalkingTrait, SpeakingTrait {
     
    String speakAndWalk() {
        WalkingTrait.super.speakAndWalk()
    }
    
}