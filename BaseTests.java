@AfterMethod
public void recordFailure(ITestResult result){

    if(ITestResult.FAILURE == result.getStatus())
    {
        var camera = (TakesScreenshot)driver;
        Files.move(screenshot, new File("resources/screenshots/test.png"));

        try{
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
