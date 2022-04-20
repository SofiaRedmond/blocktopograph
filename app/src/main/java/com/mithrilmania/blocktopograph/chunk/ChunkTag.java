package com.mithrilmania.blocktopograph.chunk;

import static java.lang.Integer.toHexString;

/**
 * Reference from Tommaso Checchi (/u/mojang_tommo), MCPE developer:
 * https://www.reddit.com/r/MCPE/comments/5cw2tm/level_format_changes_in_mcpe_0171_100/d9zv9s8/
 */
public enum ChunkTag {

    DATA_3D((byte) 0x2B),
    VERSION((byte) 0x2C),
    DATA_2D((byte) 0x2D),// using for pre 1.18.0
    DATA_2D_LEGACY((byte) 0x2E),// using for pre 1.0.0
    TERRAIN((byte) 0x2F),// Terrain for a 16x16x16 subchunk
    V0_9_LEGACY_TERRAIN((byte) 0x30),// using for pre 1.0.0
    BLOCK_ENTITY((byte) 0x31),
    ENTITY((byte) 0x32),
    PENDING_TICKS((byte) 0x33),//TODO untested
    BLOCK_EXTRA_DATA((byte) 0x34),//TODO untested, 32768 bytes, used for top-snow.
    BIOME_STATE((byte) 0x35),//TODO untested
    GENERATOR_STAGE((byte) 0x36),
    BORDER_BLOCKS((byte) 0x38),// Education Edition Feature
    HARDCODED_SPAWN_AREAS((byte) 0x39),
    RANDOM_TICKS((byte) 0x3A),
    CHECKSUMS((byte) 0x3B),// using for pre 1.18.0
    VERSION_PRE16((byte) 0x76),
    ;


    public final byte dataID;

    ChunkTag(byte dataID) {
        this.dataID = dataID;
    }

    public String toString() {
        return "0x" + toHexString(dataID);
    }

}
