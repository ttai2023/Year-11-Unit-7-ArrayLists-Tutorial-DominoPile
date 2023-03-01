public class Domino {
    int top;
    int bottom;

    public Domino() {
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "" + top +
                "/" + bottom +
                "";
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    //settle() - compares the top and bottom values and orders them so the smaller number is on top. (use flip to do this once the smaller value has been identified)
    public void settle() {
        if(top > bottom) {
            int temp = top;
            top = bottom;
            bottom = temp;
        }
    }

    public int compareTo(Domino other) {
        if (bottom < top) {
            if (other.getBottom() < other.getTop()) {
                if (bottom < other.getBottom()) {
                    return -1;
                } else if (bottom == other.getBottom()) {
                    if (top < other.getTop()) {
                        return -1;
                    } else if (top > other.getTop()) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 1;
                }
            } else {
                if (bottom < other.getTop()) {
                    return -1;
                } else if (bottom == other.getTop()) {
                    if (top < other.getBottom()) {
                        return -1;
                    } else if (top > other.getBottom()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
        else {
            if (other.getBottom() < other.getTop()) {
                if (top < other.getBottom()) {
                    return -1;
                }
                else if (top == other.getBottom()) {
                    if (bottom < other.getTop()) {
                        return -1;
                    }
                    else if (top > other.getTop()) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
                else {
                    return 1;
                }
            }
            else {
                if (top < other.getTop()) {
                    return -1;
                }
                else if (top == other.getTop()) {
                    if (bottom < other.getBottom()) {
                        return -1;
                    }
                    else if (bottom > other.getBottom()) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        }
        return 0;
    }

    /*
    compareToWeight(Domino other)
Counts the total number of dots on each ½ of the Domino and compares it to the total number on the other domino.
Returns -1 if this < other
Returns 1 if this > other
Returns 0 if this == other
     */
    public int compareToWeight(Domino other) {
        if(top + bottom > other.getTop() + other.getBottom()) {
            return 1;
        }
        else if(top + bottom < other.getTop() + other.getBottom()) {
            return -1;
        }
        else {
            return 0;
        }

    }

    public boolean canConnect(Domino other) {
        if (top == other.getTop() || top == other.getBottom() || bottom == other.getTop() || bottom == other.getBottom()) {
            return true;
        }
        return false;
    }
}

    //    Default Constructor - sets the top and bottom to 0.
//    Overloading Constructor - takes in 2 integers and puts the first one into top and the second one into bottom.
//    Getters
//            Setters
//    toString that displays the domino as a fraction (top/bottom) - Don't do actual math on this.
//    flip() - switches the order of the top and bottom values.
//            settle() - compares the top and bottom values and orders them so the smaller number is on top. (use flip to do this once the smaller value has been identified)
//    compareTo(Domino other)
//    Compares the smallest value of each domino.
//            If this < other - return -1
//    If this > other - return 1
//    If this == other Compare the larger value of each domino
//    If this < other - return -1
//    If this > other - return 1
//    If this == other - return 0
//    compareToWeight(Domino other)
//    Counts the total number of dots on each ½ of the Domino and compares it to the total number on the other domino.
//    Returns -1 if this < other
//    Returns 1 if this > other
//    Returns 0 if this == other
//    canConnect(Domino other)
//    Returns true if the 2 dominos have a common value on either side, otherwise it returns false. There are 4 possible ways of having a common value.
//this.top → other.top
//this.top → other.bottom
//    this.bottom → other.top
//this.bottom → other.bottom

