.class public abstract LG2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD2/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LD2/w;

    const-string v1, "NO_OWNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG2/e;->a:LD2/w;

    return-void
.end method
