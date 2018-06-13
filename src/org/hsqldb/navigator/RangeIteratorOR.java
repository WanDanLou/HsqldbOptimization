package org.hsqldb.navigator;

import org.hsqldb.RangeVariable;

public interface RangeIteratorOR extends RangeIterator{
    public RangeVariable.RangeVariableConditions[] getConditions();

    public RangeVariable.RangeVariableConditions[] getwhereConditions();

    public RangeVariable.RangeVariableConditions[] getjoinConditions();

    public void setConditionsOR(RangeVariable.RangeVariableConditions[] c);

    public void setWhereConditionsOR(RangeVariable.RangeVariableConditions[] c);

    public void setjoinConditionsOR(RangeVariable.RangeVariableConditions[] c);
}
