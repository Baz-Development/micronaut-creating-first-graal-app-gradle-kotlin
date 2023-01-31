package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lexample/micronaut/ConferenceController;", "", "conferenceService", "Lexample/micronaut/ConferenceService;", "(Lexample/micronaut/ConferenceService;)V", "randomConf", "Lexample/micronaut/Conference;", "micronautguide"})
@io.micronaut.http.annotation.Controller(value = "/conferences")
public final class ConferenceController {
    private final example.micronaut.ConferenceService conferenceService = null;
    
    public ConferenceController(@org.jetbrains.annotations.NotNull
    example.micronaut.ConferenceService conferenceService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/random")
    public final example.micronaut.Conference randomConf() {
        return null;
    }
}