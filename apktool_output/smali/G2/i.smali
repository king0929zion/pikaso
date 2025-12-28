.class public abstract LG2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:LD2/w;

.field public static final c:LD2/w;

.field public static final d:LD2/w;

.field public static final e:LD2/w;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, LD2/a;->k(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, LG2/i;->a:I

    new-instance v0, LD2/w;

    const-string v1, "PERMIT"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG2/i;->b:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1, v4}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG2/i;->c:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1, v4}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG2/i;->d:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1, v4}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG2/i;->e:LD2/w;

    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v1, 0x10

    invoke-static {v0, v1, v2, v2, v3}, LD2/a;->k(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, LG2/i;->f:I

    return-void
.end method
