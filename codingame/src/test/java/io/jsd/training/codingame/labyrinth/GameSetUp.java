package io.jsd.training.codingame.labyrinth;

public abstract class GameSetUp {

	protected final Kirk kirk = new Kirk();
	protected final KirkSituation kirkSituation = kirk.getKirksituation();

	protected final static String ASTAR_0 = "?????";
	protected final static String ASTAR_1 = "??T??";
	protected final static String ASTAR_2 = "?????";

	protected final static String LINE_1 = "#####";
	protected final static String LINE_2 = "#T.C#";
	protected final static String LINE_3 = "#####";

	protected final static String LINE_OF_CHARP = "#######";
	protected final static String LINE_5 = "#T...?#";
	protected final static String LINE_6 = "#T...C#";

	protected final static int ALARM_COUNT = 7;

	protected final String[][] grid = new String[3][5];
	protected Labyrinth labyrinth;

	protected final String[][] gridInLine = new String[3][7];
	protected Labyrinth labyrinthInLine;

	protected final String[][] gridInLineWithCommandRoom = new String[3][7];
	protected Labyrinth labyrinthInLineWithCommandRoom;

	protected final String[][] unknownGrid = new String[3][5];
	protected Labyrinth unknownLabyrinth;

	protected final Alarm alarm = new Alarm(ALARM_COUNT);
}
