.class public final LD/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/o;


# instance fields
.field public a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LD/K0;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public get(I)Lp/t;
    .locals 1

    iget-object v0, p0, LD/K0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp/u;

    return-object p1
.end method
