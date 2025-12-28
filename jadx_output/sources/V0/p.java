package v0;

/* loaded from: classes.dex */
public final class p {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        ((p) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=false, emojiSupportMatch=EmojiSupportMatch.Default)";
    }
}
