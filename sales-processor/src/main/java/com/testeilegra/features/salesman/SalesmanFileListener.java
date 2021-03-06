package com.testeilegra.features.salesman;

import com.testeilegra.dataanalytic.DataAnalytic;
import com.testeilegra.listener.FileListener;
import com.testeilegra.parser.DefaultParser;

import java.util.List;

public class SalesmanFileListener extends FileListener {

    private SalesmanData salesmanData = SalesmanData.getInstance();
    private DataAnalytic dataAnalytic = new DataAnalytic();
    private static final String SALESMAN_ID = "002";

    @Override
    public void proccess(List<String> lines) {
        salesmanData.add(DefaultParser.parseWithDefaultSplitter(lines, SALESMAN_ID));
        this.dataAnalytic.analyseResult();
    }
}
