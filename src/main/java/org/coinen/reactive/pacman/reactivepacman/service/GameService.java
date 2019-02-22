package org.coinen.reactive.pacman.reactivepacman.service;

import org.coinen.pacman.Config;
import org.coinen.pacman.Nickname;
import reactor.core.publisher.Mono;

public interface GameService {

    Mono<Config> start(Nickname nickname);
}
