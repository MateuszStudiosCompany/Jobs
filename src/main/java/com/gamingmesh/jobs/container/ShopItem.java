package com.gamingmesh.jobs.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShopItem {

    private String NodeName = null;

    private double price = 0D;

    private int slot = -1;
    private int page = -1;

    private int IconId = 1;
    private int IconData = 0;
    private int IconAmount = 1;
    private String IconName = null;
    private List<String> IconLore = new ArrayList<>();

    private boolean HideWithoutPerm = false;
    private int RequiredTotalLevels = -1;

    private List<String> RequiredPerm = new ArrayList<>();
    private HashMap<String, Integer> RequiredJobs = new HashMap<>();

    private List<String> Commands = new ArrayList<>();

    private List<JobItems> items = new ArrayList<>();

    public ShopItem(String NodeName, double price, int IconId) {
	this.NodeName = NodeName;
	this.price = price;
	this.IconId = IconId;
    }

    public void setPage(Integer page) {
	this.page = page;
    }

    public int getPage() {
	return page;
    }

    public void setSlot(Integer slot) {
	this.slot = slot;
    }

    public int getSlot() {
	return slot;
    }

    public void setitems(List<JobItems> items) {
	this.items = items;
    }

    public List<JobItems> getitems() {
	return items;
    }

    public void setCommands(List<String> Commands) {
	this.Commands = Commands;
    }

    public List<String> getCommands() {
	return Commands;
    }

    public void setRequiredJobs(HashMap<String, Integer> RequiredJobs) {
	this.RequiredJobs = RequiredJobs;
    }

    public HashMap<String, Integer> getRequiredJobs() {
	return RequiredJobs;
    }

    public void setRequiredPerm(List<String> RequiredPerm) {
	this.RequiredPerm = RequiredPerm;
    }

    public List<String> getRequiredPerm() {
	return RequiredPerm;
    }

    public void setHideWithoutPerm(boolean HideWithoutPerm) {
	this.HideWithoutPerm = HideWithoutPerm;
    }

    public boolean isHideWithoutPerm() {
	return HideWithoutPerm;
    }

    public void setIconLore(List<String> IconLore) {
	this.IconLore = IconLore;
    }

    public List<String> getIconLore() {
	return IconLore;
    }

    public String getNodeName() {
	return NodeName;
    }

    public int getIconId() {
	return IconId;
    }

    public int getIconData() {
	return IconData;
    }

    public void setIconData(int IconData) {
	this.IconData = IconData;
    }

    public double getPrice() {
	return price;
    }

    public void setIconAmount(int IconAmount) {
	this.IconAmount = IconAmount;
    }

    public int getIconAmount() {
	return IconAmount;
    }

    public void setIconName(String IconName) {
	this.IconName = IconName;
    }

    public String getIconName() {
	return IconName;
    }

    public int getRequiredTotalLevels() {
	return RequiredTotalLevels;
    }

    public void setRequiredTotalLevels(int RequiredTotalLevels) {
	this.RequiredTotalLevels = RequiredTotalLevels;
    }
}
