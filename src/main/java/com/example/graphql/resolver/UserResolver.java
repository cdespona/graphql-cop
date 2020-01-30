package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserResolver implements GraphQLResolver<User> {

}
