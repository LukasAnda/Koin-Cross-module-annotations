import androidx.compose.ui.window.ComposeUIViewController
import org.example.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
