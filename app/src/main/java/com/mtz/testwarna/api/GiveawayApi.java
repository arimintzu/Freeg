package com.mtz.testwarna.api;

import com.mtz.testwarna.value.GiveawayValue;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GiveawayApi {
    @GET("giveaways")
    Call<GiveawayValue> getAllGiveaways();

    @GET("giveaways/{user_id}")
    Call<GiveawayValue> getGiveawaysByUser(@Path("user_id") int user_id);

    @POST("giveaways")
    @FormUrlEncoded
    Call<GiveawayValue> addGiveaway(@Field("user_id") int user_id,
                                    @Field("content") String content,
                                    @Field("image") String image,
                                    @Field("participants") int participants,
                                    @Field("status") String status);
}
