package bwdm;

import bwdm.boundaryValueAnalysisUnit.BoundaryValueAnalyzer;
import bwdm.informationStore.InformationExtractor;
import com.fujitsu.vdmj.lex.LexException;
import com.fujitsu.vdmj.syntax.ParserException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Test_BoundaryValueAnalyzer {


	@Test
	void test() throws LexException, ParserException, IOException {

		InformationExtractor information = new InformationExtractor(
				"Arg2_Japanese",
				"./vdm_files/");
		BoundaryValueAnalyzer bvAnalyzer = new BoundaryValueAnalyzer(information);




	}

}
