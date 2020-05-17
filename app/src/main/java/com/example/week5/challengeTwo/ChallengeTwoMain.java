package com.example.week5.challengeTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.week5.R;

import org.w3c.dom.Text;

public class ChallengeTwoMain extends AppCompatActivity {
    public static final String TEXT= "Text";
    private static final String textOne = "Let’s start with a twist on the classic Schrödinger’s cat situation. In this famous thought experiment, a cat is trapped in a box with radioactive material; if it decays, the radiation triggers a detector that releases a poison gas, and the cat is killed.\n" +
            "        But until we check inside to measure the outcome, the contents of the box are in two states simultaneously: in one there has been no decay and the cat is alive, and in the other there has been a decay and the cat is dead. At the moment we take a peek, the decision is made and the cat turns out to be dead or lives another day.\n" +
            "        But if you subtly peeked into the box thousands of times per second to keep an eye on the radioactive material, you might be able to alter its behaviour. Depending on the way you observe, it turns out to be possible to either delay the decay (called the quantum Zeno effect) or accelerate it (the quantum anti-Zeno effect). The effect takes its name from the ancient Greek philosopher Zeno, who in a series of logical paradoxes – the most famous involves the athletic hero Achilles in a footrace with a tortoise — ‘proved’ that movement was impossible because any distance could be cut into an infinite number of smaller distances.\n" +
            "        The twist is that the Zeno effects occur due to the disturbance caused by the measurement – even shaking the box without looking inside might be enough to do the trick.";
    private static final String textTwo = "Schrödinger’s cat is an example of one of the stranger ideas in quantum physics: superposition. This basically says that objects can exist in two or more states at the same time – while a cat that is both alive and dead isn’t something you’re likely to see in real life, physicists in the lab often make use of electrons that are spinning clockwise and counterclockwise simultaneously, say.\n" +
            "        Building on this idea, scientists have shown that ghostly particles called neutrinos can be trapped in two or more states at once as they travel over hundreds of kilometres. Neutrinos are subatomic particles that barely interact with matter (ten trillion pass through your hand per second) and they can rapidly oscillate between different “flavours” or types as they speed through space, starting as one flavour and arriving at their destination as another.\n" +
            "        But this switch isn’t simple. Research shows that during the journey, the neutrinos have no definite flavour – they remain in a state of identity crisis, simultaneously many flavours at once. ";
    private static final String textThree = "Quantum optics is an area of research involving light and its interactions with matter on the tiniest of scales.\n" +
            "        The Hong-Ou-Mandel effect describes the weird ways in which two photons can interact in a beam splitter, which is an optical device that splits a beam of light in two, like a prism. When a photon enters a 50:50 beam splitter it can either bounce off or pass through, with a 50% chance of each possibility.\n" +
            "        If two identical photons enter a beam splitter from either side (as pictured), there are four different possibilities:\n" +
            "            1.The photon above is reflected and the photon below is transmitted;\n" +
            "            2.Both are transmitted;\n" +
            "            3.Both are reflected;\n" +
            "            4.The photon above is transmitted and the photon below is reflected.\n" +
            "        Here’s where it gets strange: because the photons are identical, we can’t distinguish possibility 2 from possibility 3 – and so the identical photons just cancel each other out.\n" +
            "        As a result, 1 and 4 are the only results you ever see: both photons will always end up on the same side of the splitter.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_two_main);
    }

    public void textOneView(View view) {
        Intent intent = new Intent(ChallengeTwoMain.this,TextOneActivity.class);
        intent.putExtra(TEXT,textOne);
        startActivity(intent);
    }

    public void textTwoView(View view) {
        Intent intent = new Intent(ChallengeTwoMain.this,TextOneActivity.class);
        intent.putExtra(TEXT,textTwo);
        startActivity(intent);
    }

    public void textThreeView(View view) {
        Intent intent = new Intent(ChallengeTwoMain.this,TextOneActivity.class);
        intent.putExtra(TEXT,textThree);
        startActivity(intent);
    }
}
