package fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.view.*
class FirstFragment : Fragment() {
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.activity_login_register, container, false) as ViewGroup
        communicator = activity as Communicator
        rootView.btnRegister.setOnClickListener {
            communicator.passData(rootView.nameedit.text.toString())
            communicator.passData(rootView.mobileedit.text.toString())
            communicator.passData(rootView.doaminedit.text.toString())
            communicator.passData(rootView.addressedit.text.toString())
        }
        return rootView
    }
}
fragmentTwo.xm

