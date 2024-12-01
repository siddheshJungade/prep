

public abstract class LogProcessor {
    private LogProcessor nextProcessor;

    public static INFO = 1
    public static DEBUG = 2
    public static ERROR = 3


    public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void log(int level, String message) {
        if (nextProcessor != null) {
            nextProcessor.log(level, message);
        }
    }
}


public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(level, message);
        }
    }
}


public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(level, message);
        }
    }
}

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(level, message);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        LogProcessor errorLogProcessor = new ErrorLogProcessor(null);
        LogProcessor debugLogProcessor = new DebugLogProcessor(errorLogProcessor);
        LogProcessor infoLogProcessor = new InfoLogProcessor(debugLogProcessor);

        infoLogProcessor.log(INFO, "This is an info message");
        infoLogProcessor.log(DEBUG, "This is a debug message");
        infoLogProcessor.log(ERROR, "This is an error message");
    }
}