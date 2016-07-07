package app.homes;

import java.util.List;

import app.people.Child;

/**
 * Created by Stella on 7/7/2016.
 */
public class HomeFactory {

    public static Home createHome(String type, List<String> homeArguments, List<Child> children) {

        Home home = null;
        switch (type) {

            case "YoungCouple":
                home = new YoungCoupleHome(
                        Double.parseDouble(homeArguments.get(0)),
                        Double.parseDouble(homeArguments.get(1)),
                        Double.parseDouble(homeArguments.get(2)),
                        Double.parseDouble(homeArguments.get(3)),
                        Double.parseDouble(homeArguments.get(4)));
                break;
            case "YoungCoupleWithChildren":
                home = new YoungCoupleWithChildren(
                        Double.parseDouble(homeArguments.get(0)),
                        Double.parseDouble(homeArguments.get(1)),
                        Double.parseDouble(homeArguments.get(2)),
                        Double.parseDouble(homeArguments.get(3)),
                        Double.parseDouble(homeArguments.get(4)),
                        children);
                break;
            case "AloneYoung":
                home = new AloneYoung(
                        Double.parseDouble(homeArguments.get(0)),
                        Double.parseDouble(homeArguments.get(1)));
                break;
            case "OldCouple":
                home = new OldCoupleHome(
                        Double.parseDouble(homeArguments.get(0)),
                        Double.parseDouble(homeArguments.get(1)),
                        Double.parseDouble(homeArguments.get(2)),
                        Double.parseDouble(homeArguments.get(3)),
                        Double.parseDouble(homeArguments.get(4)));
                break;
            case "AloneOld":
                home = new AloneOld(
                        Double.parseDouble(homeArguments.get(0)));
                break;

        }

        return home;

    }
}
