package com.vedruna.oliasmoralesm01.interfaces;

import com.vedruna.oliasmoralesm01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface CRUDInterface{

    @GET("product")
    Call<List<Product>> getAll();
}
