.class public final Lz1/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LL0/f;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL0/f;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, LL0/f;-><init>(I)V

    sput-object v0, Lz1/Q;->b:LL0/f;

    return-void
.end method

.method public static a()Lz1/Q;
    .locals 1

    sget-object v0, Lz1/Q;->b:LL0/f;

    invoke-virtual {v0}, LL0/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/Q;

    if-nez v0, :cond_0

    new-instance v0, Lz1/Q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    return-object v0
.end method
