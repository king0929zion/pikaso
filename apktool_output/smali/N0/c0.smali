.class public final Ln0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final b:Ln0/c0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/c0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln0/c0;-><init>(I)V

    sput-object v0, Ln0/c0;->b:Ln0/c0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ln0/c0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Ln0/c0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ln0/z;

    check-cast p2, Ln0/z;

    iget v0, p1, Ln0/z;->m:I

    iget v1, p2, Ln0/z;->m:I

    invoke-static {v0, v1}, Lp2/g;->f(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Lp2/g;->f(II)I

    move-result v0

    :goto_0
    return v0

    :pswitch_0
    check-cast p1, Ln0/z;

    check-cast p2, Ln0/z;

    iget v0, p2, Ln0/z;->m:I

    iget v1, p1, Ln0/z;->m:I

    invoke-static {v0, v1}, Lp2/g;->f(II)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Lp2/g;->f(II)I

    move-result v0

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
