package com.surya.graphql.schema;

import graphql.annotations.GraphQLAnnotations;
import graphql.schema.GraphQLSchema;

import static graphql.schema.GraphQLSchema.newSchema;

import com.surya.graphql.mutation.UserMutation;
import com.surya.graphql.query.UserQuery;

public class UserSchema {

    private final GraphQLSchema schema;

    public UserSchema() throws IllegalAccessException, NoSuchMethodException, InstantiationException {
        schema = newSchema().query(GraphQLAnnotations.object(UserQuery.class))
            .mutation(GraphQLAnnotations.object(UserMutation.class))
            .build();
    }

    public GraphQLSchema getSchema() {
        return schema;
    }
}
