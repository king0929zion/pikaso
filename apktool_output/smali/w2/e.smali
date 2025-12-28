.class public final Lw2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw2/f;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA0/c;Lo2/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lw2/e;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lw2/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw2/f;Lo2/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lw2/e;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw2/e;->b:Ljava/lang/Object;

    check-cast p2, Lp2/h;

    iput-object p2, p0, Lw2/e;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, Lw2/e;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lw2/k;

    invoke-direct {v0, p0}, Lw2/k;-><init>(Lw2/e;)V

    return-object v0

    :pswitch_0
    new-instance v0, LJ/c;

    invoke-direct {v0, p0}, LJ/c;-><init>(Lw2/e;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
