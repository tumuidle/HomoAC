package cn.afternode.homo.homoac.modules.crasher;

import cn.afternode.homo.homoac.utils.module.ChildrenModule;
import cn.afternode.homo.homoac.utils.module.Module;
import cn.afternode.homo.homoac.utils.module.PacketReceiveListener;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerDigging;

public class Nocom extends ChildrenModule implements PacketReceiveListener {
    public Nocom(Module parent) {
        super(parent);
    }

    // 未实现
    @Override
    public void onPacket(PacketReceiveEvent event) {
        /*
        [Wurst7 NocomCrashHack] **API::FABRIC**
        [pickRandomPos]
        int x = random.nextInt(16777215);
		int y = 255;
		int z = random.nextInt(16777215);
		return new Vec3d(x, y, z);
		[sendNocomPacket]
		Vec3d pos = pickRandomPos();
		BlockHitResult blockHitResult =
			new BlockHitResult(pos, Direction.DOWN, new BlockPos(pos), false);
		IMC.getInteractionManager()
			.sendPlayerInteractBlockPacket(Hand.MAIN_HAND, blockHitResult);
         */
        if (event.getPacketType() == PacketType.Play.Client.PLAYER_DIGGING) {
            WrapperPlayClientPlayerDigging pkt = new WrapperPlayClientPlayerDigging(event);
        }
    }
}
