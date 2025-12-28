.class public abstract LP0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x7f030240

    const v1, 0x7f0303ae

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LP0/a;->a:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LP0/a;->b:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100b3
        0x7f03024c
        0x7f03024d
        0x7f03024e
        0x7f03027b
        0x7f030284
        0x7f030285
    .end array-data
.end method
