package com.example.pengenabsen;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RegisterAPI {

    @FormUrlEncoded
    @POST("save.php")
    Call<Value> daftar(@Field("noabsn") String noabsn,
                       @Field("nama") String nama,
                       @Field("kelas") String kelas,
                       @Field("jam") String jam,
                       @Field("ket") String ket);

    @GET("view.php")
    Call<Value> view();
}

