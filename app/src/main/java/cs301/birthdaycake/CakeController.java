package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView newCakeView;
    private CakeModel newCakeModel;

    public CakeController(CakeView CakeV) {
        newCakeView = CakeV;
        newCakeModel = CakeV.getModel();

    }

    @Override
    public void onClick(View view) {
        newCakeModel.isLit = false;
        newCakeView.invalidate();
        Log.d("BlowOutButton", "BLOW OUT");
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b == false) {
            newCakeModel.isCandles = false;
            newCakeView.invalidate();
        }
        if (b == true){
            newCakeModel.isCandles = true;
            newCakeView.invalidate();
        }


        Log.d("Candles GoAway", "Candles");

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        newCakeModel.totalCandles = i;
        this.newCakeView.invalidate();

    }



    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

























