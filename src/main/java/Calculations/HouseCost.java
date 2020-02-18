package Calculations;

public class HouseCost {

    int houseArea;
    boolean automated;
    int materialStandard;
    double constructionCost;

    public HouseCost(int houseArea, boolean automated, int materialStandard) {
        this.houseArea = houseArea;
        this.automated = automated;
        this.materialStandard = materialStandard;
    }

    public double costCalculate()
    {
        int perSquare [] = {1200 , 1500 ,1800 , 2500};
        if(materialStandard >= 0 && materialStandard <=3)
        {
            constructionCost = houseArea * perSquare[ materialStandard -1 ];
        }
        else {
            return 0;
        }
        return constructionCost;
    }
}
