package kr.hs.emirim.sjung.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {//인터페이스 속에는 추상메소드(OnClick)가 선언되어있다
    Button butPlus, butMinus, butDivide, butMultiply;
    EditText editNum1, editNum2;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);//메인메모리에 적재 그 위치값 리턴받아서 참조변수에 대입
        butPlus=(Button)findViewById(R.id.but_plus);//Veiw가 위젯패키지 내의 최상
        butMinus=(Button)findViewById(R.id.but_minus);
        butDivide=(Button)findViewById(R.id.but_divide);
        butMultiply=(Button)findViewById(R.id.but_multiply);

        editNum1=(EditText)findViewById(R.id.edit_num1);
        editNum2=(EditText)findViewById(R.id.edit_num2);

        textResult=(TextView)findViewById(R.id.text_result);
        butPlus.setOnClickListener(this);//버튼 객체에 이벤트 설정 : OnClick호출
        butMinus.setOnClickListener(this);
        butDivide.setOnClickListener(this);
        butMultiply.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {//v 안에 getId()메소드가 있다
//        2개의 EditText에 입력된 값을 반환
        String num1Str=editNum1.getText().toString(); //참조 변수
        String num2Str=editNum2.getText().toString(); //참조 변수
        int num1=Integer.parseInt(num1Str);
        int num2=Integer.parseInt(num2Str);
        double result=0;
        switch(v.getId()){//이벤트에서 발생된 객체 정보를 v가 갖고있다.
            case R.id.but_plus:
                result=num1+num2;
                break;
            case R.id.but_minus:
                result=num1-num2;
                break;
            case R.id.but_divide:
                result=(double)num1/num2;
                break;
            case R.id.but_multiply:
                result=num1*num2;
                break;

        }
        textResult.setText("* 계산 결과 : "+result);
    }
}