public class StreamingFascade {
    UserAccount userAccount = new UserAccount();
    MovieSelection movieSelection = new MovieSelection();
    StreamingService streamingService = new StreamingService();
    PaymentProcessor paymentProcessor = new PaymentProcessor();

    public void startStream(){
        userAccount.checkUser();
        movieSelection.movieName("DeadPool");
        streamingService.startStreaming();
        paymentProcessor.payAmount("vibhanshu",500);
    }
}
