package Contracts;

import Contracts.ComicCharacter;

import java.util.List;

public interface Arena {

    String getArenaName();

	boolean isArenaFull();

	void addHero(ComicCharacter hero);

	void addAntiHero(ComicCharacter antiHero);

	boolean fightHeroes();

	public List<ComicCharacter> getHeroes();


}
