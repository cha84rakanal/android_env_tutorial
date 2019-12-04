using Android.App;
using Android.Widget;
using Android.OS;

namespace HelloToggleColor.Droid
{
    [Activity(Label = "HelloToggleColor", MainLauncher = true, Icon = "@mipmap/icon")]
    public class MainActivity : Activity
    {
        private bool toggle = true;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            // Get our button from the layout resource,
            // and attach an event to it
            Button button = FindViewById<Button>(Resource.Id.myButton);

            button.Click += delegate {
                Android.Util.Log.Info("Xamarine","onClick");
                ((RelativeLayout)button.Parent).SetBackgroundColor((toggle)?Android.Graphics.Color.Red : Android.Graphics.Color.Blue);
                toggle = !toggle;
            };
        }
    }
}

