package gitam.edu.apssdc.bommini.room;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Myrepositer {
    public MyDao myDao;
    public LiveData<List<Myentity>> liveData;
    public Myrepositer(Application application){



    }

    public LiveData<List<Myentity>> getLiveData() {
        return liveData;
    }
    public void inset(Myentity myentity){
        MyAsy asy=new MyAsy(myDao);
        asy.execute(myentity);
    }

    private class MyAsy extends AsyncTask<Myentity,Void,Void> {
        MyDao dao;
        public MyAsy(MyDao myDao) {
            this.dao=myDao;
        }

        @Override
        protected Void doInBackground(Myentity... myentities) {

            return null;
        }
    }
}
