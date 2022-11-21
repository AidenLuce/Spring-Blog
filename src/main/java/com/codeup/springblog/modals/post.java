package com.codeup.springblog.modals;

import javax.persistence.*;

public class post{

    private long id;
    private String title;
    private String body;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public post (){}

    public post(String title, String body) {
        this.title = title;
        this.body = body;
    }
    public post (long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    @Entity
    @Table(name="Repo_Jpa_database")
    public class postApplication {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false, length = 25)
        private String header;

        @Column(nullable = false, length = 250)
        private String body;
    }
}



//

