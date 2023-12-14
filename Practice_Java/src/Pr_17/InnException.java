package Pr_17;

import java.math.BigInteger;

public class InnException extends Exception {

    private BigInteger innNum;

    public InnException(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}