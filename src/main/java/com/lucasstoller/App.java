package com.lucasstoller;

import picocli.CommandLine;

import com.lucasstoller.commands.NextCommand;
import com.lucasstoller.models.Figure;
import com.lucasstoller.models.Quote;
import com.lucasstoller.models.Work;
import com.lucasstoller.models.WorkType;


public class App 
{
    public static void main( String[] args )
    {
        Work works[] = {
            new Work("Avengers", WorkType.MOVIE),
            new Work("Peaky Blinders", WorkType.SERIE)
        };
        Figure figures[] = {
            new Figure("Captain America"),
            new Figure("Thomas Shelby")
        };
        Quote quotes[] = {
            new Quote(works[0], figures[0], "I Understood that reference."),
            new Quote(works[1], figures[1], "You Don't Parley When You're On The Back Foot."),
            new Quote(works[1], figures[1], "It's Not A Good Idea To Look At Tommy Shelby The Wrong Way."),
        };

        CommandLine.run(new NextCommand(quotes), args);
    }
}
