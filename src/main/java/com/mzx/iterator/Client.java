package com.mzx.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:43
 */
public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<College>();

        College computerCollege = new ComputerCollege();
        College infoCollege = new InfoCollege();

        colleges.add(computerCollege);
//        colleges.add(infoCollege);

        OutputImpl out = new OutputImpl(colleges);
        out.printCollege();
    }
}
