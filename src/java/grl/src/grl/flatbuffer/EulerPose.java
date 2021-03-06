// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class EulerPose extends Struct {
  public EulerPose __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public grl.flatbuffer.Vector3d position() { return position(new grl.flatbuffer.Vector3d()); }
  public grl.flatbuffer.Vector3d position(grl.flatbuffer.Vector3d obj) { return obj.__init(bb_pos + 0, bb); }
  public EulerRotation rotation() { return rotation(new EulerRotation()); }
  public EulerRotation rotation(EulerRotation obj) { return obj.__init(bb_pos + 24, bb); }

  public static int createEulerPose(FlatBufferBuilder builder, double position_x, double position_y, double position_z, double rotation_r1, double rotation_r2, double rotation_r3, byte rotation_eulerOrder) {
    builder.prep(8, 56);
    builder.prep(8, 32);
    builder.pad(7);
    builder.putByte(rotation_eulerOrder);
    builder.putDouble(rotation_r3);
    builder.putDouble(rotation_r2);
    builder.putDouble(rotation_r1);
    builder.prep(8, 24);
    builder.putDouble(position_z);
    builder.putDouble(position_y);
    builder.putDouble(position_x);
    return builder.offset();
  }
};

