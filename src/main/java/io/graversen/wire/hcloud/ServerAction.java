package io.graversen.wire.hcloud;

public class ServerAction {
    private final int id;
    private final String command;
    private final String status;
    private final int progress;
    private final String started;
    private final String finished;

    public ServerAction(int id, String command, String status, int progress, String started, String finished) {
        this.id = id;
        this.command = command;
        this.status = status;
        this.progress = progress;
        this.started = started;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public String getCommand() {
        return command;
    }

    public String getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public String getStarted() {
        return started;
    }

    public String getFinished() {
        return finished;
    }
}
