package com.conneckto.lostandfound.dao;

import com.conneckto.lostandfound.model.Claims;
import com.conneckto.lostandfound.model.LostAndFound;

/**
 * Created by suryaveer on 2016-05-23.
 */
public interface LostAndFoundDAO {

    public abstract void  getLostAndFoundItems();

    public abstract void updateLostAndFoundItems(LostAndFound lostAndFound);

    public abstract void claimFoundItem(Claims claim);

    public abstract void removeReportedItem(LostAndFound lostAndFound);
}
