package com.hritiktambe.pracstack.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Items {

    @SerializedName("tags")
    @Expose
    private List<String> tags;

    @SerializedName("owner")
    @Expose
    private OwnerProfile owner;

    @SerializedName("is_answered")
    @Expose
    private boolean isAnswered;

    @SerializedName("view_count")
    @Expose
    private int viewCount;

    @SerializedName("answer_count")
    @Expose
    private int answerCount;

    @SerializedName("score")
    @Expose
    private String score;

    @SerializedName("last_activity_date")
    @Expose
    private int lastActivityDate;

    @SerializedName("creation_date")
    @Expose
    private int creationDate;

    @SerializedName("question_id")
    @Expose
    private int questionId;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("title")
    @Expose
    private String title;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public OwnerProfile getOwner() {
        return owner;
    }

    public void setOwner(OwnerProfile owner) {
        this.owner = owner;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public String  getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(int lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
