package test;

import config.Properties;
import service.IAnalysisDataService;
import service.IAnalysisDataServiceImpl;
import utils.SettingUtils;

public class Test {
	public static void main(String[] args) {
		IAnalysisDataService   analysisDataService = new IAnalysisDataServiceImpl();
		String result = analysisDataService.exportModel(Properties.DEFUALT_PRIMITIVE_DATA_PATH_120,Properties.TestPath.SAMPLE_TYPE_PATH, 3, 0,Properties.TestPath.saveResult_path);
//		SettingUtils.outPutTextToFile(result, Properties.TestPath.saveResult_path);
		
//		analysisDataService.exportModel(Properties.TestPath.saveResult_path);
		
	}
}