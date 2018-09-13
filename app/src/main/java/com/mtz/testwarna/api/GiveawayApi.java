package com.mtz.testwarna.api;

import com.mtz.testwarna.value.GiveawayValue;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GiveawayApi {
    @GET("giveaways")
    Call<GiveawayValue> getAllGiveaways();

    @GET("giveaways/{user_id}")
    Call<GiveawayValue> getGiveawaysByUser(@Path("user_id") int user_id);

    
}
