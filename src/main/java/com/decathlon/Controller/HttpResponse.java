package com.decathlon.Controller;

public class HttpResponse {
    private Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public HttpResponse(int score) {
        setScore(score);
    }
}
