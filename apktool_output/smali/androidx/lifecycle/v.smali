.class public Landroidx/lifecycle/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;

.field public volatile c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/v;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm/f;

    invoke-direct {v0}, Lm/f;-><init>()V

    sget-object v0, Landroidx/lifecycle/v;->d:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/v;->c:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/v;->b:Ljava/lang/Object;

    return-void
.end method
