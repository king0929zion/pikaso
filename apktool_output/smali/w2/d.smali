.class public final Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw2/f;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lw2/d;->a:I

    iput-object p2, p0, Lw2/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget v0, p0, Lw2/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw2/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    return-object v0

    :pswitch_0
    new-instance v0, Lw2/c;

    invoke-direct {v0, p0}, Lw2/c;-><init>(Lw2/d;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
