package soaresdeveloper.com.app.projetosqlite;

/**
 * Created by Soares on 27/11/2017.
 */

import android.content.Context;

public class ClienteDAO {

    private final String TABLE_CLIENTES = "Clientes";
    private DbGateway gw;

    public ClienteDAO(Context ctx){
        gw = DbGateway.getInstance(ctx);
    }
}