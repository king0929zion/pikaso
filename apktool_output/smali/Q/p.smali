.class public final Lq/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/H;


# static fields
.field public static final a:Lq/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq/p;->a:Lq/p;

    return-void
.end method


# virtual methods
.method public final a(Ls/g;)Ln0/h;
    .locals 1

    new-instance v0, Lq/o;

    invoke-direct {v0, p1}, Lq/o;-><init>(Ls/g;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
