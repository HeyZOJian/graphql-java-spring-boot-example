package com.example.DemoGraphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.repository.AuthorRepository;
import com.example.DemoGraphQL.repository.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class QueryA implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public QueryA(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    public long test(){
        return 11;
    }
}
