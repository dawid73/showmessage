package com.test.showmessage.message;

import lombok.*;
import org.springframework.beans.factory.support.GenericTypeAwareAutowireCandidateResolver;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Size(min=2, max = 1000)
    private String wiadomosc;

    @Column(name = "wyswietlone",columnDefinition = "int default 0")
        private int wyswielone;
}
