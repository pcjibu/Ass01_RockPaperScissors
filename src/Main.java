import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean playing = true;

        do
        {
            System.out.print("What is your move player A: [R,P,S]: ");
            if (in.hasNextLine())
            {
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                {
                    System.out.println("player B move [R,P,S]");
                    if (in.hasNextLine()) {
                        playerB = in.nextLine();
                        if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                        {
                            if (playerA.equalsIgnoreCase("R"))
                            {
                                if (playerB.equalsIgnoreCase("R"))
                                {
                                    System.out.println("ROCK vs ROCK! It's a TIE!");

                                } else if (playerB.equalsIgnoreCase("P"))
                                {
                                    System.out.println("PAPER covers ROCK! Player B wins!");
                                } else
                                {
                                    System.out.println("ROCK breaks SCISSORS! Player A wins!");

                                }
                            }
                            else if (playerA.equalsIgnoreCase("P"))
                            {
                                if (playerB.equalsIgnoreCase("R"))
                                {
                                    System.out.println("PAPER covers ROCK! Player B wins!");

                                } else if (playerB.equalsIgnoreCase("P"))
                                {
                                    System.out.println("PAPER vs PAPER! It's a TIE!");
                                } else
                                {
                                    System.out.println("SCISSORS cuts PAPER! Player B wins!");
                                }
                            } else
                            {
                                if (playerB.equalsIgnoreCase("R"))
                                {
                                    System.out.println("ROCK breaks SCISSORS! Player B wins!");
                                } else if (playerB.equalsIgnoreCase("P"))
                                {
                                    System.out.println("SCISSORS cuts PAPER! Player A wins!");
                                } else {
                                    System.out.println("SCISSORS vs SCISSORS! It's a TIE!");

                                }
                            }

                        }
                    }
                    else
                    {
                        System.out.println("Not A valid move, try again.");
                    }
                }
            }
            else
            {
                System.out.println("Not A valid move, try again.");
            }

            System.out.println("do you want to play again? [Y/N]");
            if (in.hasNextLine())
            {
                playAgain = in.nextLine();
                if(playAgain.equalsIgnoreCase("y"))
                {
                    playing = true;
                }
                else if (playAgain.equalsIgnoreCase("n"))
                {
                    playing = false;
                }
                else
                {
                    System.out.println("invalid Response, try again");
                }

            }
            else
            {
                System.out.print("\nThat is not a valid move");
            }

        } while (playing);
    }
}